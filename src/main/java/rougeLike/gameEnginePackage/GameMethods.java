package rougeLike.gameEnginePackage;

import org.apache.commons.codec.digest.DigestUtils;
import rougeLike.EntityPackage.HibernateUtil;
import rougeLike.EntityPackage.User;
import rougeLike.PlayerPackage.AccountGender;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GameMethods {

    static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();

    public static String passwordEncryption(String password) {
        return DigestUtils.md5Hex(password);
    }
    public static void addDataToDB(Object obj) {

        em.getTransaction().begin();

        em.persist(obj);

        em.getTransaction().commit();
    }
    public static int verifyUsername(String email) {

        em.getTransaction().begin();

        List<User> userList = em.createQuery("from User u where u.email = :param", User.class)
                .setParameter("param", email)
                .getResultList();

        if (userList.isEmpty()) {
            System.out.println("There is no such user");
            em.getTransaction().commit();
            return -1;
        } else {
            em.getTransaction().commit();
            return userList.get(0).getUserId();
        }
    }
    public static boolean verifyPassword(int userId, String password, String message) {
        List<User> logInUsers = new ArrayList<>();
        em.getTransaction().begin();

        List<User> userList = em.createQuery("from User u where u.userId = :param", User.class)
                .setParameter("param", userId)
                .getResultList();

        if (userList.get(0).getPassword().equals(passwordEncryption(password))) {
            System.out.println("Your are logged in");
            em.getTransaction().commit();
            logInUsers.add(userList.get(0));
            return true;
        } else {
            System.out.println(message);
            em.getTransaction().commit();
            return false;
        }
    }
    public static boolean verifyMail(String email) {
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }
    public static boolean verifyGender(String gender){
        Pattern pattern = Pattern.compile("MALE", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(gender);
        return matcher.find();
    }
    public static int userLogIn() {
        System.out.println("Insert your email: ");
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();
        int userId = verifyUsername(userName);
        if (userId == -1) {
            return -1;
        } else {
            System.out.println("Enter your password: ");
            for (int counter = 1; counter < 4; counter++) {
                scan = new Scanner(System.in);
                String password = scan.nextLine();
                if (verifyPassword(userId, password, "Wrong password")) {
                    break;
                } else {
                    if (counter == 3) {
                        System.out.println("You have entered the wrong password 3 times, your account is blocked, try after 5 min");
                        userId = -1;
                    } else System.out.println("Enter password again;");
                }
            }
            return userId;
        }
    }
    public static void setUserGender(){
        List<AccountGender> enumGenderList = new ArrayList<>();
        enumGenderList.add(AccountGender.MALE);
        enumGenderList.add(AccountGender.FEMALE);
        System.out.println(enumGenderList);
        }
    public static void addUser() {
        int role = 3;
        var scanner = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = scanner.nextLine();
        if (!verifyMail(email)) {
            int countTrials = 0;
            while (!verifyMail(email)) {
                countTrials++;
                System.out.println("Please correct you email (trial " + countTrials + "from 3: ");
                email = scanner.nextLine();
            }
        }
        System.out.println("Chose your account gender: ");
        setUserGender();
        String userGender = scanner.nextLine();
        if(userGender.equalsIgnoreCase("MALE")) {
            userGender = String.valueOf(AccountGender.MALE);
        } if(userGender.equalsIgnoreCase("FEMALE")){
            userGender = String.valueOf(AccountGender.FEMALE);
        } if(userGender.isEmpty()){
            System.out.println("You didnt chose account gender");
            return;
        } if(!verifyGender(userGender)){
            return;
        }
        System.out.println("Enter your account password: ");
        String userPassword = scanner.nextLine();
        String userPasswordRepeated = "";
        int count = 0;
        do {
            if (count == 0) {
                System.out.println("Repeat the password");
            } else {
                System.out.println("Passwords do not match, try again");
            }
            userPasswordRepeated = scanner.nextLine();
            count++;
            if(count == 4) {
                System.out.println("Wrong password to many times");
                break;
            }
        } while (!userPassword.equals(userPasswordRepeated));
        addDataToDB(new User(passwordEncryption(userPassword), email, AccountGender.valueOf(userGender)));
    }

}

package example.carsharingprototype;

public class UserDb implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    public static java.util.Map<String,example.carsharingprototype.User> userDb = new java.util.HashMap<String,example.carsharingprototype.User>();
    
    public static void createUser(example.carsharingprototype.User user) throws Exception {
        if (userDb.containsKey(user.getEmailAddress())) {
            throw new Exception();
        }
        userDb.put(user.getEmailAddress(), user);
        System.out.println("Storing user: " + user.toString());
    }
    
    public static void activateUser(String email) {
        if (userDb.containsKey(email)) {
            if (userDb.get(email).isIsActivated()) {
                System.out.println("User with email '" + email + "' already activated");
            } else {
                userDb.get(email).setIsActivated(true);
                System.out.println("Activating User with email '" + email + "'");
            }
        } else {
            System.out.println("User with email '" + email + "' doesn't exist");
        }
    }
    
    public static void verifyUser(String email) {
        if (userDb.containsKey(email)) {
            if (!userDb.get(email).isIsActivated()) {
                System.out.println("User with email '" + email + "' is not activated yet");
                return;
            }
            if (userDb.get(email).isIsVerified()) {
                System.out.println("User with email '" + email + "' already verified");
            } else {
                userDb.get(email).setIsVerified(true);
                System.out.println("Verifying User with email '" + email + "'");
            }
        } else {
            System.out.println("User with email '" + email + "' doesn't exist");
        }
    }
        
    public static void removeUser(String email) {
        if (userDb.containsKey(email)) {
            userDb.remove(email);
            System.out.println("User with email '" + email + "' has been removed");
        } else {
            System.out.println("User with email '" + email + "' doesn't exist");
        }
    }
    
    static {
        System.out.println("Initializing database");
        userDb.put("milanmatijka@gmail.com", new example.carsharingprototype.User());
    }

    public UserDb() {
    }

}


package exception;

public class UserNotFoundException extends Exception{



    public UserNotFoundException (String message) throws UserNotFoundException {
        throw new UserNotFoundException("Böyle bir kullanıcı mevcut değiildir.");
    }

}

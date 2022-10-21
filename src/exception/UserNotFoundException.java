package exception;

public class UserNotFoundException extends Exception{

    // TODO User bulunamadiginda "Boyle bir kullanici mevcut degildir" ikazi veren bir Exception tanimlayin...

    public UserNotFoundException (String message) throws UserNotFoundException {
        throw new UserNotFoundException("Böyle bir kullanıcı mevcut değiildir.");
    }

}

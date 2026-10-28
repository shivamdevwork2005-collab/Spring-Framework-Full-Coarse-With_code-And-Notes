package in.strikes;


import java.util.List;

public class UserService {

//    private List<String> usernames;
//
//    public UserService(List<String> usernames) {
//        this.usernames = usernames;
//    }

//    public List<String> getUsernames() {
//        return usernames;
//    }

    public UserService() {
        System.out.println("UserService created");
    }

    public void init() {
        System.out.println("Post construct phase");
    }

    public void cleanup() {
        System.out.println("Pre Destroy phase");
    }
}

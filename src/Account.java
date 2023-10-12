import java.util.ArrayList;

public class Account implements AccountFunctionalities{

    public String username;
    private String email;
    private String password;
    private ArrayList<String> posts = new ArrayList<>();
    private ArrayList<Account> friendList = new ArrayList<>();
    private ArrayList<Account> blockList = new ArrayList<>();
    private boolean loggedIn;

    public Account(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        loggedIn = true;
    }


    @Override
    public void login(String username, String password) {
        if(loggedIn)
        {
            System.out.println("You are already logged in");
        }
        else
        {
            if((username.equals(this.username) && (password.equals(this.password))))
            {
                System.out.println("You have logged in successfully");
                loggedIn = true;

            }
            else
            {
                System.out.println("Invalid login try again");
            }
        }
    }

    @Override
    public void logout() {
        System.out.println("You have logged out successfully!" );
        loggedIn = false;

    }

    @Override
    public void post(String newPost) {
        posts.add(newPost);
        System.out.println("New post added");
    }

    @Override
    public void addFriend(Account newFriend) {
        if(blockList.contains(newFriend)){
            System.out.println("Cannot add someone in your blocklist!");
        }
        else{
            friendList.add(newFriend);
            System.out.println(newFriend + " has been added to your friend list.");
        }
    }

    @Override
    public void removeFriend(Account newFriend) {
        friendList.remove(newFriend);
        System.out.println(newFriend + " has been removed from your friend list.");
    }

    @Override
    public void blockUser(Account blockUser) {
        blockList.add(blockUser);
        System.out.println(blockUser + " has been blocked.");
    }

    @Override
    public void displayPosts() {
        System.out.println("YOUR ACCOUNT POSTS: ");
        for (int i = 0; i < posts.size(); i++){
            System.out.println("--------------");
            System.out.println((i+1) + " ." + posts.get(i));
        }

    }

    @Override
    public void editPost(int postNumber, String newPost) {
        posts.set(postNumber-1, newPost);
        System.out.println("Post has been edited successfully!");

    }

    @Override
    public void deletePost(int postNumber) {
        posts.remove(postNumber-1);
        System.out.println("Post has been deleted successfully!");

    }

    @Override
    public String toString() {
        return username;
    }

    @Override
    public void displayFriendList() {
        System.out.println("YOUR FRIENDLIST: ");
        for(var a : friendList){
            System.out.println("-----------");
            System.out.println(a);
        }
    }

    @Override
    public void displayBlockList() {
        System.out.println("YOUR BLOVKLIST: ");
        for(var a : blockList){
            System.out.println("-----------");
            System.out.println(a);
        }
    }



}

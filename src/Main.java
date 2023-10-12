public class Main {
    public static void main(String[] args) {

        Account a1 = new Account("Fifi", "fifi0610@gmail.com", "0610fifi");
        Account a2 = new Account("shrimp", "shrimp1007@gmail.com", "1007shrimp");
        Account a3 = new Account("Melanda", "ZmO_On@gamil.com", "mO_On");

        //Adding some posts to account
        a1.post("I like listening music!");
        a1.post("I eat noodles on the top of the mountain");
        a1.post("I meet my friends");


        //Viewing user posts
        a1.displayPosts();

        //editing a post
        a1.editPost(2, "Today I caught a fish!");

        //Viewing user posts
        a1.displayPosts();

        //deleting a post
        a1.deletePost(1);

        //viewing user posts
        a1.displayPosts();

        //blocking user
        a1.blockUser(a3);

        //display block list
        a1.displayBlockList();

        //adding a friend
        a1.addFriend(a2);

       //display friend list
        a1.displayFriendList();

        //try to add a blocked user
        a1.addFriend(a3);

        //remove a friend
        a1.removeFriend(a2);

        //display friend list
        a1.displayFriendList();



    }
}
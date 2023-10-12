

public interface AccountFunctionalities {
    void login(String username, String password);
    void logout();
    void post(String newPost);
    void editPost(int postNumber, String newPost);
    void deletePost(int postNumber);
    void displayPosts();
    void addFriend(Account newFriend);
    void removeFriend(Account newFriend);
    void blockUser(Account blockUser);

    void displayFriendList();
    void displayBlockList();




}

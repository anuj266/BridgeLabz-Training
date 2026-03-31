package linkedlist;

class FriendNode {
    int friendId;
    FriendNode next;

    FriendNode(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}

class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friends;
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = null;
        this.next = null;
    }
}

public class SocialMediaSystem {


    static UserNode addUser(UserNode Head, int userId, String name, int age) {
        UserNode newNode = new UserNode(userId, name, age);

        if (Head == null) {
            return newNode;
        }

        UserNode curr = Head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
        return Head;
    }

    static UserNode searchUser(UserNode Head, int userId) {
        UserNode curr = Head;

        while (curr != null) {
            if (curr.userId == userId) {
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }

    static void searchUser(UserNode Head, String name) {
        UserNode curr = Head;

        while (curr != null) {
            if (curr.name.equals(name)) {
                System.out.println("Found: " + curr.userId + " " + curr.age);
                return;
            }
            curr = curr.next;
        }

        System.out.println("User not found");
    }


    static void addFriend(UserNode user, int friendId) {
        if (user.friends == null) {
            user.friends = new FriendNode(friendId);
            return;
        }

        FriendNode curr = user.friends;
        while (curr.next != null) {
            if (curr.friendId == friendId)
                return;
            curr = curr.next;
        }

        curr.next = new FriendNode(friendId);
    }

    static void addFriendConnection(UserNode Head, int user1Id, int user2Id) {
        UserNode user1 = searchUser(Head, user1Id);
        UserNode user2 = searchUser(Head, user2Id);

        if (user1 == null || user2 == null) {
            System.out.println("Invalid user ID");
            return;
        }

        addFriend(user1, user2Id);
        addFriend(user2, user1Id);
    }

    static void removeFriend(UserNode user, int friendId) {
        if (user.friends == null)
            return;

        if (user.friends.friendId == friendId) {
            user.friends = user.friends.next;
            return;
        }

        FriendNode curr = user.friends;
        while (curr.next != null) {
            if (curr.next.friendId == friendId) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }

    static void removeFriendConnection(UserNode Head, int user1Id, int user2Id) {
        UserNode user1 = searchUser(Head, user1Id);
        UserNode user2 = searchUser(Head, user2Id);

        if (user1 == null || user2 == null) {
            System.out.println("Invalid user ID");
            return;
        }

        removeFriend(user1, user2Id);
        removeFriend(user2, user1Id);
    }


    static void displayFriends(UserNode Head, int userId) {
        UserNode user = searchUser(Head, userId);

        if (user == null) {
            System.out.println("User not found");
            return;
        }

        FriendNode curr = user.friends;
        System.out.print("Friends of " + user.name + ": ");

        if (curr == null) {
            System.out.println("No friends");
            return;
        }

        while (curr != null) {
            System.out.print(curr.friendId + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    static void countFriends(UserNode Head) {
        UserNode curr = Head;

        while (curr != null) {
            int count = 0;
            FriendNode f = curr.friends;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(curr.name + " has " + count + " friends");
            curr = curr.next;
        }
    }


    static void mutualFriends(UserNode Head, int user1Id, int user2Id) {
        UserNode user1 = searchUser(Head, user1Id);
        UserNode user2 = searchUser(Head, user2Id);

        if (user1 == null || user2 == null) {
            System.out.println("Invalid user ID");
            return;
        }

        FriendNode f1 = user1.friends;
        boolean found = false;

        System.out.print("Mutual Friends: ");

        while (f1 != null) {
            FriendNode f2 = user2.friends;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                    found = true;
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }

        if (!found)
            System.out.println("None");
        else
            System.out.println();
    }


    public static void main(String[] args) {

        UserNode Head = null;

        Head = addUser(Head, 1, "Anuj", 21);
        Head = addUser(Head, 2, "Aman", 22);
        Head = addUser(Head, 3, "Rohit", 23);
        Head = addUser(Head, 4, "Neha", 21);

        addFriendConnection(Head, 1, 2);
        addFriendConnection(Head, 1, 3);
        addFriendConnection(Head, 2, 3);
        addFriendConnection(Head, 2, 4);

        displayFriends(Head, 2);

        mutualFriends(Head, 1, 2);

        removeFriendConnection(Head, 1, 3);

        countFriends(Head);

        searchUser(Head, "Neha");
    }
}


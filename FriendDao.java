package com.web.Dao;


import java.util.List;

import com.web.model.Friend;
import com.web.model.User;

public interface FriendDao {
	List<User> getSuggestedUsers(String email);
	void addFriendRequest(Friend friend);
	List<Friend> getPendingRequests(String email);
	void acceptFriendRequest(Friend friend);
	void deleteFriendRequest(Friend friend);
	List<User> listOfFriends(String email);
}





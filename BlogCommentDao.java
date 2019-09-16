package com.web.Dao;


import java.util.List;

import com.web.model.BlogComment;

public interface BlogCommentDao {
	void addBlogComment(BlogComment blogComment);
	List<BlogComment> getBlogComment(int blogPostId);
	void deleteBlogComment(BlogComment blogComment);
}





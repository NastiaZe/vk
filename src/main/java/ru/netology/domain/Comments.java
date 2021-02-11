package ru.netology.domain;

public class Comments {
    private int count; //число комментариев
    private String next_commentsInfo; // следующий комментарий
    private String firstNewCommentsInfo; //показать первый комментарий
    private boolean canComment; //может ли пользователь прокомментировать запись
    private boolean likeComment; //может ли пользователь поставить лайк  на комментрий

    private boolean canOpenComments; //может ли пользователь открыть все комментарии
    private boolean canCloseComments; //может ли пользователь закрыть комментарии
    private boolean canGroupsComment; //могут ли группы комментировать пост

    public boolean isCanOpenComments() {
        return canOpenComments;
    }

    public void setCanOpenComments(boolean canOpenComments) {
        this.canOpenComments = canOpenComments;
    }

    public boolean isCanCloseComments() {
        return canCloseComments;
    }

    public void setCanCloseComments(boolean canCloseComments) {
        this.canCloseComments = canCloseComments;
    }

    public boolean isCanGroupsComment() {
        return canGroupsComment;
    }

    public void setCanGroupsComment(boolean canGroupsComment) {
        this.canGroupsComment = canGroupsComment;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext_commentsInfo() {
        return next_commentsInfo;
    }

    public void setNext_commentsInfo(String next_commentsInfo) {
        this.next_commentsInfo = next_commentsInfo;
    }

    public String getFirstNewCommentsInfo() {
        return firstNewCommentsInfo;
    }

    public void setFirstNewCommentsInfo(String firstNewCommentsInfo) {
        this.firstNewCommentsInfo = firstNewCommentsInfo;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public boolean isLikeComment() {
        return likeComment;
    }

    public void setLikeComment(boolean likeComment) {
        this.likeComment = likeComment;
    }
}



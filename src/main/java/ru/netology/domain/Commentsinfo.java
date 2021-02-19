package ru.netology.domain;

public class Commentsinfo {
    private int count; //число комментов
    private String next_commentsInfo; // следующий коммент
    private String firstNewCommentsInfo; //показать первый коммент
    private boolean canComment; //может ли пользователь откомментировать запись
    private boolean likeComment; //может ли пользователь лайкнуть комментарий

    private boolean canOpenComments; //может ли пользователь открыть все комментарии
    private boolean canCloseComments; //может ли пользователь закрыть комментарии к записи
    private boolean canGroupsComment; //могут ли сообщества комментировать запись

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

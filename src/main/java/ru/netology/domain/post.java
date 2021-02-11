package ru.netology.domain;

public class post {
    private int id;
    private int timePublication; // время публикации поста
    private String namePost; // название поста
    private boolean complain; //пожаловаться
    private String descriptionPost;// описание поста
    private boolean subscribe; //подписаться
    private long amountOfViews; // количество просмотров
    private int share; // поделиться постом
    private String attachmentsPost; //вложения
    private boolean addFavorite; // добавить в избранное

    private String device; //устройство, с которого сделан пост
    private String postType; //тип поста
    private double friendsOnly; //запись могут видеть только друзья
    private boolean fixPost; //запись закреплена
    private boolean noNotificationsPost; //не отправлять уведомления по активности на данном посте


    private Author author;
    private Comments commentsInfo;
    private likes likes;



    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }



    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public double getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(double friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public boolean isFixPost() {
        return fixPost;
    }

    public void setFixPost(boolean fixPost) {
        this.fixPost = fixPost;
    }

    public boolean isNoNotificationsPost() {
        return noNotificationsPost;
    }

    public void setNoNotificationsPost(boolean noNotificationsPost) {
        this.noNotificationsPost = noNotificationsPost;
    }




    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTimePublication() {
        return timePublication;
    }

    public void setTimePublication(int timePublication) {
        this.timePublication = timePublication;
    }

    public String getNamePost() {
        return namePost;
    }

    public void setNamePost(String namePost) {
        this.namePost = namePost;
    }

    public boolean isComplain() {
        return complain;
    }

    public void setComplain(boolean complain) {
        this.complain = complain;
    }

    public String getDescriptionPost() {
        return descriptionPost;
    }

    public void setDescriptionPost(String descriptionPost) {
        this.descriptionPost = descriptionPost;
    }

    public boolean isSubscribe() {
        return subscribe;
    }

    public void setSubscribe(boolean subscribe) {
        this.subscribe = subscribe;
    }

    public long getAmountOfViews() {
        return amountOfViews;
    }

    public void setAmountOfViews(long amountOfViews) {
        this.amountOfViews = amountOfViews;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }



    public String getAttachmentsPost() {
        return attachmentsPost;
    }

    public void setAttachmentsPost(String attachmentsPost) {
        this.attachmentsPost = attachmentsPost;
    }

    public boolean isAddFavorite() {
        return addFavorite;
    }

    public void setAddFavorite(boolean addFavorite) {
        this.addFavorite = addFavorite;
    }


}

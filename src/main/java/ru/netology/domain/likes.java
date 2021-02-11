package ru.netology.domain;

public class likes {
    private int count; //количество лайков
    private boolean canLike; //возможность лайкнуть


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }
}


package com.xiaowu.pojo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class People {

    private String name;

    private Integer age;

    private String[] friends;

    private List<Integer> nums;

    private List<Cat> cats;

    private Set<Pig> pigs;

    private Map<String, User> userMap;

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public Set<Pig> getPigs() {
        return pigs;
    }

    public void setPigs(Set<Pig> pigs) {
        this.pigs = pigs;
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }

    public List<Integer> getNums() {
        return nums;
    }

    public void setNums(List<Integer> nums) {
        this.nums = nums;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String[] getFriends() {
        return friends;
    }

    public void setFriends(String[] friends) {
        this.friends = friends;
    }
}

package ru.pestovnikova.Lesson4;

import java.util.Date;

public class User {
    private int userId;
    private String name;
    private String lastName;
    private String email;
    private Date registrationDate;

    User(){
        userId = 0;
        name = "";
        lastName = "";
        email = "";
        registrationDate = new Date();
    }

    User(int userId, String name, String lastName, String email, Date registrationDate){
        this.userId = userId;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.registrationDate = registrationDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof User)){
            return false;
        }

        User other = (User)obj;
        return (userId == other.userId)
                && (name.equals(other.name)
                && lastName.equals(other.lastName))
                && email.equals(other.email)
                && registrationDate.equals(other.registrationDate);

    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + name.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + registrationDate.hashCode();

        return result;
    }

    public int getUserId(){
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}

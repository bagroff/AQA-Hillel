public class User {
    String userName;
    private int age;
    String email;
    private String password;
    boolean isActive;
    double amountSpentMoney = 0;

    // Constructors

    public User(String userName, int age, String email, String password, boolean isActive, double amountSpentMoney) {
        this.setUserName(userName);
        this.setAge(age);
        this.setEmail(email);
        this.setPassword(password);
        this.setActive(isActive);
        this.amountSpentMoney = amountSpentMoney;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.setPassword(password);
    }

    public User(String userName) {
        this.userName = userName;
    }

    // Getters and setters

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Wrong age range.");
        }
        this.age = age;
    }

    public double getAmountSpentMoney() {
        return amountSpentMoney;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.matches("[\\w.]+@[\\w.]+\\.\\w+")) {
            throw new IllegalArgumentException("Invalid email format.");
        }
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password != null && password.length() < 6) {
            throw new IllegalArgumentException("Password should be more than 6 characters longer");
        }
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    // Purchase method

    public void makePurchase(double purchasePrice) {
        System.out.println("Purchase made for: " + purchasePrice);
        amountSpentMoney += purchasePrice;
    }

    // Total Spent money method

    public void printTotalAmountOfSpentMoney() {
        System.out.println("The total amount of spent money is: " + this.amountSpentMoney);
    }

    @Override
    public String toString() {
        return "User {" + (userName != null ? "userName = '" + userName + '\'' : "") +
                (age != 0 ? ",  age = " + age : "") +
                (email != null ? ", email = '" + email + '\'' : "") +
                (password != null ? ", password = '" + password + '\'' : "") +
                (isActive != false ? ", isActive = " + isActive : "") +
                (amountSpentMoney != 0 ? ", amountSpentMoney = " + amountSpentMoney : "") +
                '}';
    }

    // Main method
    public static void main(String[] args) {
        UserTest usertest = new UserTest();
        usertest.test();
    }
}
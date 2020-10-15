public class detailAccount {
    private String username;
    private String password;
    private String website;


    //getter

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getWebsite() {
        return website;
    }



    //setter

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setWebsite(String website) {
        this.website = website;
    }


    //password generator
    public void generatePassword(int banyak){
        int i=0;
        String passwordt="";
        while(i<banyak){
            int character = (int)(Math.random()*57+65);
            char ch=(char)character;
             i++;
             passwordt=passwordt+ch;
        }
        this.password=passwordt;
    }
}


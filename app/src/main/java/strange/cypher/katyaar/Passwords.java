package strange.cypher.katyaar;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by pnmhatre on 11/21/2017.
 */
@Entity(nameInDb = "password_base")
public class Passwords {
    @Id(autoincrement = true)
    private long id;

    @Property(nameInDb = "title")
    private String title;

    @Property(nameInDb = "account")
    private String account;

    @Property(nameInDb = "website")
    private String website;

    @Property(nameInDb = "username")
    private String username;

    @Property(nameInDb = "password")
    private String password;

    @Property(nameInDb = "notes")
    private String notes;

    @Generated(hash = 1983564953)
    public Passwords(long id, String title, String account, String website,
            String username, String password, String notes) {
        this.id = id;
        this.title = title;
        this.account = account;
        this.website = website;
        this.username = username;
        this.password = password;
        this.notes = notes;
    }

    @Generated(hash = 1946681627)
    public Passwords() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAccount() {
        return this.account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getWebsite() {
        return this.website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

}


package Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


import java.util.Date;

@Entity
@Table(name="problem")
public class Problem implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;
    private String openid;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date update;
    private String address;
    private String tell;
    private String discription;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "pid=" + pid +
                ", openid='" + openid + '\'' +
                ", update=" + update +
                ", address='" + address + '\'' +
                ", tell='" + tell + '\'' +
                ", discription='" + discription + '\'' +
                '}';
    }
}

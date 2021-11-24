package nl.meliharslan.ewa.database.domein;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class TableRoom implements Serializable {
    @Id // give primaire key id zie logo bij id
    @GeneratedValue(strategy = GenerationType.AUTO) // pass the strategy
    @Column(nullable = false, updatable = false) // column aanpassen of regels opstellen
    private Long id;
    private String name, email, imageUrl, roomTitle, phone;
    @Column(nullable = false, updatable = false) // column aanpassen of regels opstellen
    private String roomCode;

    public TableRoom() {
    }

    public TableRoom(String name, String email, String imageUrl, String roomTitle, String phone, String roomCode) {
        this.name = name;
        this.email = email;
        this.imageUrl = imageUrl;
        this.roomTitle = roomTitle;
        this.phone = phone;
        this.roomCode = roomCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getRoomTitle() {
        return roomTitle;
    }

    public void setRoomTitle(String roomTitle) {
        this.roomTitle = roomTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    @Override
    public String toString() {
        return "TableRoom{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", roomTitle='" + roomTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", roomCode='" + roomCode + '\'' +
                '}';
    }
}

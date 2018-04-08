package com.filimonchik.bean;

import lombok.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;

///**
// * Entity - User
// */
//@Data
//@Entity
//@Table(name = "advert")
//@NoArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
//public class Advert implements Serializable {



    @Data
    @Entity
    @Table(name = "advert")
    @NoArgsConstructor
    @Getter
    @Setter
    @EqualsAndHashCode
    @ToString
   public class Advert  implements Serializable {

public static final String Carbody_REGEX = "[a-zA-Zа-яА-Я0-9_.-]+";
public static final String Color_REGEX = "[a-zA-Zа-яА-Я0-9_.-]+";
public static final String Description_REGEX = "[a-zA-Zа-яА-Я0-9_.-]+";
public static final String Style_REGEX = "[a-zA-Zа-яА-Я0-9_.-]+";

        private static final long serialVersionUID = 1L;

        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "description")
        private String description;

        @Column(name = "carbody")
        private String carbody;

        @Column(name = "style")
        private String style;

        @Column(name = "color")
        private String color;

        @ManyToOne(cascade = CascadeType.ALL)
        @JoinColumn(columnDefinition="integer", name="user_id")
        private User user;


        public Advert( String carbody, String color, String description, String style) {
            this.carbody = carbody;
            this.color = color;
            this.description = description;
            this.style = style;

        }



        public void setColor(String color) {
            this.color = color;
        }

        public void setCarbody(String carbody) {
            this.carbody = carbody;
        }


        public void setDescription(String description) {
            this.description = description;
        }

        public void setStyle(String style) {
            this.style = style;
        }

        public String getColor() {
            return color;
        }

        public String getCarbody() {
            return carbody;
        }


        public String getDescription() {
            return description;
        }

        public String getStyle() {
            return style;
        }

        public int getId() {
            return id;
        }

    }

















































//    private static final long serialVersionUID = 1L;
//
//    @Column
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @Column
//    private String carbody;
//    @Column
//    private String color;
//    @Column
//    private String description;
//    @Column
//    private String models;
//
//    @ManyToOne(cascade = CascadeType.PERSIST)
//    @JoinColumn(name = "FK_User")
//    private User user;
//
//
//    public Advert( String carbody, String color, String description, String models) {
//
//        this.carbody = carbody;
//        this.color = color;
//        this.description = description;
//        this.models = models;
//    }
//
//    public void setCarbody(String carbody) {
//        this.carbody = carbody;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public void setModels(String models) {
//        this.models = models;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getCarbody() {
//        return carbody;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public String getModels() {
//        return models;
//    }
//}
//
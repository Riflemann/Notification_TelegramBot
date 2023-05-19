package com.notification_telegrambot.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notification_tasks")
@Getter
@Setter
public class NotificationTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "message")
    private String message;

    @Column(name = "chat_id")
    private long chatId;

    @Column(name = "notification_ldt")
    private LocalDateTime notificationLocalDateTime;
}

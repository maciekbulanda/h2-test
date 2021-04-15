create schema if not exists hospital;
create table HOSPITAL.PATIENT
(
    ID   INTEGER auto_increment
        primary key,
    NAME VARCHAR(255)
);

create table HOSPITAL.VISIT
(
    ID         INTEGER auto_increment
        primary key,
    VISIT_DATE DATE,
    VISIT_TIME TIME,
    PATIENT_ID INTEGER,
    constraint FK_PATIENT
        foreign key (PATIENT_ID) references HOSPITAL.PATIENT (ID)
);

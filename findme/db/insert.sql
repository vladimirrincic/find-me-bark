DELETE FROM `dogs`;
DELETE FROM `address`;
DELETE FROM `users`;

INSERT INTO `users`(`ID`,`STATUS`,`TYPE`,`USERNAME`,`PASSWORD`,`KENNEL_NAME`,`NAME`,`DESCRIPTION`,`EMAIL`)
VALUES (1,'ACTIVE','BREEDER','kostaben','kostaben','Kosta and Ben','Kosta Gogov','Kosta and Ben description','kosta@gmail.com');
INSERT INTO `users`(`ID`,`STATUS`,`TYPE`,`USERNAME`,`PASSWORD`,`KENNEL_NAME`,`NAME`,`DESCRIPTION`,`EMAIL`)
VALUES (2,'INACTIVE','BREEDER','milenadora','milenadora','Milena and Dora','Milena Kocic','Milena and Dora description','milena@gmail.com');
INSERT INTO `users`(`ID`,`STATUS`,`TYPE`,`USERNAME`,`PASSWORD`,`KENNEL_NAME`,`NAME`,`DESCRIPTION`,`EMAIL`)
VALUES (3,'ACTIVE','BREEDER','ivanraf','ivanraf','Ivan and Raf','Ivan Cvetkovic','Ivan and Raf description','ivan@gmail,com');
INSERT INTO `users`(`ID`,`STATUS`,`TYPE`,`USERNAME`,`PASSWORD`,`KENNEL_NAME`,`NAME`,`DESCRIPTION`,`EMAIL`)
VALUES (4,'ACTIVE','BREEDER','rincic','rincic','Rincic and Megi','Rincic Jeki','Rincic and Megi description','rincic@gmail,com');

INSERT INTO `address`(`ID`,`BREEDER_ID`,`COUNTRY`,`CITY`) VALUES (1, 1,'Serbia','Nis');
INSERT INTO `address`(`ID`,`BREEDER_ID`,`COUNTRY`,`CITY`) VALUES (2, 2,'Serbia','Nis');
INSERT INTO `address`(`ID`,`BREEDER_ID`,`COUNTRY`,`CITY`) VALUES (3, 3,'Malta','Valletta');
INSERT INTO `address`(`ID`,`BREEDER_ID`,`COUNTRY`,`CITY`) VALUES (4, 4,'Serbia','Nis');

INSERT INTO `dogs`(`ID`,`STATUS`,`BREEDER_ID`,`BREAD`,`NAME`,`FOR_SALE`,`GENDER`,`DOB`,`DESCRIPTION`,`FATHER_ID`,`MOTHER_ID`)
VALUES (1,'FOR_SALE',1,'Golden Retriever','Ben',TRUE,'Male','2014-01-10','Kostin Ben description',NULL, NULL);
INSERT INTO `dogs`(`ID`,`STATUS`,`BREEDER_ID`,`BREAD`,`NAME`,`FOR_SALE`,`GENDER`,`DOB`,`DESCRIPTION`,`FATHER_ID`,`MOTHER_ID`)
VALUES (2,'PRIVATE',2,'Golden Retriever','Dora',TRUE,'Female','2013-10-10','Milenina Dora description',NULL, NULL);
INSERT INTO `dogs`(`ID`,`STATUS`,`BREEDER_ID`,`BREAD`,`NAME`,`FOR_SALE`,`GENDER`,`DOB`,`DESCRIPTION`,`FATHER_ID`,`MOTHER_ID`)
VALUES (3,'FOR_SALE',1,'Golden Retriever','Benka',TRUE,'Female','2014-01-10','Kostina Benka description',NULL, NULL);
INSERT INTO `dogs`(`ID`,`STATUS`,`BREEDER_ID`,`BREAD`,`NAME`,`FOR_SALE`,`GENDER`,`DOB`,`DESCRIPTION`,`FATHER_ID`,`MOTHER_ID`)
VALUES (4,'SOLD',1,'Golden Retriever','Ben2',TRUE,'Male','2014-01-10','Kostin Ben2 description',NULL, NULL);
INSERT INTO `dogs`(`ID`,`STATUS`,`BREEDER_ID`,`BREAD`,`NAME`,`FOR_SALE`,`GENDER`,`DOB`,`DESCRIPTION`,`FATHER_ID`,`MOTHER_ID`)
VALUES (5,'FOR_SALE',3,'Stafford','Raf',TRUE,'Male','2013-01-10','Ivanov Raf description',NULL, NULL);
INSERT INTO .`dogs`(`ID`,`STATUS`,`BREEDER_ID`,`BREAD`,`NAME`,`FOR_SALE`,`GENDER`,`DOB`,`DESCRIPTION`,`FATHER_ID`,`MOTHER_ID`)
VALUES (6,'FOR_SALE',4,'Bull Terrier','Megi',TRUE,'Female','2014-02-10','Rincici Megi description',NULL, NULL);
INSERT INTO `dogs`(`ID`,`STATUS`,`BREEDER_ID`,`BREAD`,`NAME`,`FOR_SALE`,`GENDER`,`DOB`,`DESCRIPTION`,`FATHER_ID`,`MOTHER_ID`)
VALUES (7,'FOR_SALE',1,'Bulldog','Betmen',TRUE,'Male','2014-01-10','Kostin Betmen description', NULL, NULL);
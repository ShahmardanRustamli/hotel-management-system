package model;

public class Hotel {
 private long id;
 private String name;
 private String location;
 private String bankAccount;

 public Hotel(long id, String name, String location, String bankAccount) {
  this.id = id;
  this.name = name;
  this.location = location;
  this.bankAccount = bankAccount;
 }

 public long getId() {
  return id;
 }


 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getLocation() {
  return location;
 }

 public void setLocation(String location) {
  this.location = location;
 }

 public String getBankAccount() {
  return bankAccount;
 }

 public void setBankAccount(String bankAccount) {
  this.bankAccount = bankAccount;
 }


}

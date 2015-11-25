package com.vinayak.webstore.domain;

public class Customer { 
    private String fname;
    private String lname;
    private int mobileNo;
    private String email;
    private Address address;
    
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public int getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((fname == null) ? 0 : fname.hashCode());
        result = prime * result + ((lname == null) ? 0 : lname.hashCode());
        result = prime * result + mobileNo;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Customer other = (Customer) obj;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (fname == null) {
            if (other.fname != null)
                return false;
        } else if (!fname.equals(other.fname))
            return false;
        if (lname == null) {
            if (other.lname != null)
                return false;
        } else if (!lname.equals(other.lname))
            return false;
        if (mobileNo != other.mobileNo)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Customer [fname=" + fname + ", lname=" + lname + ", mobileNo=" + mobileNo + ", email=" + email
                + ", address=" + address + "]";
    }
    

}

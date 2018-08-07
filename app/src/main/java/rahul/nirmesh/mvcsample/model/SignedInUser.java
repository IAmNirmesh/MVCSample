package rahul.nirmesh.mvcsample.model;

import java.io.Serializable;

public class SignedInUser implements Serializable {

    private UserRole mUserRole;

    public UserRole getUserRole() {
        return mUserRole;
    }

    public void setUserRole(UserRole role) {
        mUserRole = role;
    }
}

package rahul.nirmesh.mvcsample.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import rahul.nirmesh.mvcsample.R;
import rahul.nirmesh.mvcsample.model.SignedInUser;
import rahul.nirmesh.mvcsample.model.UserRole;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    /**
     * signInEditor
     */
    public void signInEditor(View view) {
        signIn(UserRole.EDITOR);
    }

    /**
     * signInReader
     */
    public void signInReader(View view) {
        signIn(UserRole.READER);
    }

    /**
     * signInTestEditor
     */
    public void signInTestEditor(View view) {
        signIn(UserRole.TEST_EDITOR);
    }

    /**
     * signInTestReader
     */
    public void signInTestReader(View view) {
        signIn(UserRole.TEST_READER);
    }

    /**
     * signIn
     */
    private void signIn(UserRole role) {
        SignedInUser user = new SignedInUser();
        user.setUserRole(role);

        Intent intent = new Intent(this, MissionStatementActivity.class);
        String key = SignedInUser.class.getSimpleName();
        intent.putExtra(key, user);
        startActivity(intent);
    }
}

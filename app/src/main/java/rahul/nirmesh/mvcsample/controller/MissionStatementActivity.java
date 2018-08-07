package rahul.nirmesh.mvcsample.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import rahul.nirmesh.mvcsample.R;
import rahul.nirmesh.mvcsample.model.MissionStatementDAO;
import rahul.nirmesh.mvcsample.model.MissionStatementDAOFactory;
import rahul.nirmesh.mvcsample.model.UserRole;
import rahul.nirmesh.mvcsample.view.MissionStatementAccessor;

public class MissionStatementActivity extends AppCompatActivity implements MissionStatementAccessor {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission_statement);
    }

    @Override
    public String getMissionStatement(UserRole role)
    {
        MissionStatementDAO dao = MissionStatementDAOFactory.getMissionStatementDAO(
                this, role);

        return dao.getMissionStatement();
    }

    @Override
    public void saveMissionStatement(
            UserRole role,
            String missionStatement)
    {
        MissionStatementDAO dao = MissionStatementDAOFactory.getMissionStatementDAO(
                this, role);

        dao.saveMissionStatement(missionStatement);
    }
}

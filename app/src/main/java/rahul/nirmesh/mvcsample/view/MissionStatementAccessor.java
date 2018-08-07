package rahul.nirmesh.mvcsample.view;

import rahul.nirmesh.mvcsample.model.UserRole;

public interface MissionStatementAccessor {

    String getMissionStatement(UserRole role);

    void saveMissionStatement(UserRole role, String missionStatement);
}

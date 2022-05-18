package com.company.soft;


public class Group extends PeakSoft{
    private String groupName;
    private String dataOfStart;

    public Group() {}

    public Group(String groupName, String  dataOfStart) {
        this.groupName = groupName;
        this.dataOfStart = dataOfStart;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String  getDataOfStart() {
        return dataOfStart;
    }

    public void setDataOfStart(String  dataOfStart) {
        this.dataOfStart = dataOfStart;
    }

    @Override
    public String toString() {
        return "Group groupName: " + groupName + " DataOfStart: " + dataOfStart + "\n";
    }
}

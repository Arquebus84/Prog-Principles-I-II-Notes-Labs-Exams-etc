package InterfaceExamples;

public class TaskIDTest {
	public static void main(String[] args) {
		Task t = new Task("Implements");
		
		System.out.println(t instanceof TaskAction);
	}
}

interface TaskAction{
	boolean start();
	boolean complete();
	void assignTo(String userID);
}

class Task implements TaskAction{
    private String taskId;
    private int priority = 0;

    public Task(String taskId){
        this.taskId = taskId;
    }
    //taskId Mutator/Accessor
    public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	//Priority Mutator/Accessor
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}

	public boolean start(){
        System.out.println("Task started");
        return true;
    }
    public boolean complete(){
        System.out.println("Task completed");
        return true;
    }
    public void assignTo(String userId){
        System.out.println("Assigned task " + getTaskId() + " to user " + userId);
    }
	
	@Override
	public String toString() {
		return String.format("Task(%s,%d)", getTaskId(), getPriority());
	}
}
package samplepackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class Task {
	private static int idCounter = 1;
	private int id;
	private String description;
	private String deadline;
	private boolean isCompleted;

	// Constructor to initialize a new task
	public Task(String description, String deadline) {
		this.id = idCounter++;
		this.description = description;
		this.deadline = deadline;
		this.isCompleted = false;
	}

	// Getter methods
	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public String getDeadline() {
		return deadline;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	// Updated method with logging
	public void markAsCompleted() {
		this.isCompleted = true;
		// Log message when a task is marked as completed
		System.out.println("Task ID " + id + " marked as completed.");
	}

	@Override
	public String toString() {
		return "Task ID: " + id + 
				", Description: " + description + 
				", Deadline: " + deadline + 
				", Completed: " + (isCompleted ? "Yes" : "No");
	}

	// Main method for testing
	public static void main(String[] args) {
		// Creating a task
		Task task1 = new Task("Complete Java assignment", "2025-09-10");
		System.out.println(task1);  // Before completion

		// Marking the task as completed
		task1.markAsCompleted();
		System.out.println(task1);  // After completion
	}
}

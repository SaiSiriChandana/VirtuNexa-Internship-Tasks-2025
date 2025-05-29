
package models;

public class TimetableEntry {
    private TimeSlot slot;
    private Subject subject;

    public TimetableEntry(TimeSlot slot, Subject subject) {
        this.slot = slot;
        this.subject = subject;
    }

    public TimeSlot getSlot() { return slot; }
    public Subject getSubject() { return subject; }

    public String toString() {
        return slot.toString() + " | " + subject.getName();
    }
}

package main.Entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    protected String  name;
    protected Position position;
    protected int rating;
    protected String club;
    protected String nationality;

    @Override
    public String toString() {
        return name + "|" + position + "|" + rating + "|" + club + "|" + nationality +"|";
    }
}

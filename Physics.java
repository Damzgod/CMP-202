public class Physics {
    float calculatevelocity(float distance, int time){
        return distance/time;
    }

    float calculatevelocity(float initvelocity, float acceleration, int time){
        return initvelocity + (acceleration*time);
    }
}

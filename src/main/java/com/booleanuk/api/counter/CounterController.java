package com.booleanuk.api.counter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/counter")
public class CounterController {
    private int value;

    public CounterController() {
        this.value = 0;
    }

    @GetMapping
    public int getValue() {
        return value;
    }


    @GetMapping("/increment")
    public int increment() {
        value++;
        return value;
    }

    @GetMapping("/decrement")
    public int decrement() {
        value--;
        return value;
    }

}

//Annotate the CounterController class appropriately to set it up as a REST controller,
//and map all requests of http://localhost:4000/counter to it


//Create a GET method that responds with the current value of the counter. Its initial value should always be 0

//Create a GET method that maps to the route http://localhost:4000/counter/increment that increases the counter by 1 and responds
// with the updated value. The method you created in step 2 should also now respond with the updated value

//Create a GET method that maps to the route http://localhost:4000/counter/decrement that decreases the counter by 1
// and responds with the updated value
package bcmes.com.github.dp3build.middle;

import bcmes.com.github.dp3build.middle.builder.BuilderCar;
import bcmes.com.github.dp3build.middle.builder.BuilderManual;
import bcmes.com.github.dp3build.middle.car.Car;
import bcmes.com.github.dp3build.middle.car.Manual;
import bcmes.com.github.dp3build.middle.diretor.Diretor;

public class Client {

    private void anyOperation() {
        BuilderCar builder = new BuilderCar();
        builder = (BuilderCar) Diretor.makeSUV(builder);
        Car car = builder.build();

        BuilderManual builder1 = new BuilderManual();
        builder1 = (BuilderManual) Diretor.makeManualSUV(builder1);
        Manual manual = builder1.build();
    }
}

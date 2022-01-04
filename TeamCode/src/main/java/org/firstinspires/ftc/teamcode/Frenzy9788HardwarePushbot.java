package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class Frenzy9788HardwarePushbot {

    public DcMotor leftFront = null;
    public DcMotor rightFront = null;
    public DcMotor leftBack = null;
    public DcMotor rightBack = null;

    public DcMotor carousel = null;
    public DcMotor intake = null;
    public DcMotor slide = null;

    public CRServo box_1 = null;
    public CRServo box_2 = null;
    public CRServo arm_1 = null;
    public CRServo arm_2 = null;
    public Servo marker = null;

    HardwareMap hwMap           =  null;
    private ElapsedTime period  = new ElapsedTime();

    public Frenzy9788HardwarePushbot(){

    }
    public void init(HardwareMap ahwMap){
        hwMap = ahwMap;

        leftFront  = hwMap.get(DcMotor.class, "left_front");
        rightFront = hwMap.get(DcMotor.class, "right_front");
        leftBack  = hwMap.get(DcMotor.class, "left_back");
        rightBack = hwMap.get(DcMotor.class, "right_back");
        carousel = hwMap.get(DcMotor.class, "carousel");
        intake = hwMap.get(DcMotor.class, "intake");
        slide = hwMap.get(DcMotor.class, "slide");

        box_1 = hwMap.get(CRServo.class, "box1");
        box_2 = hwMap.get(CRServo.class, "box2");
        marker = hwMap.get(Servo.class, "marker");
        arm_1 = hwMap.get(CRServo.class, "arm1");
        arm_2 = hwMap.get(CRServo.class, "arm2");



        leftFront.setDirection(DcMotorSimple.Direction.REVERSE);
        leftBack.setDirection(DcMotorSimple.Direction.REVERSE);
        rightFront.setDirection(DcMotorSimple.Direction.FORWARD);
        rightBack.setDirection(DcMotorSimple.Direction.FORWARD);
        carousel.setDirection(DcMotorSimple.Direction.FORWARD);

        leftBack.setPower(0);
        leftFront.setPower(0);
        rightBack.setPower(0);
        rightFront.setPower(0);

        carousel.setPower(0);
        intake.setPower(0);
        slide.setPower(0);


        leftBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        leftFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        carousel.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }
}

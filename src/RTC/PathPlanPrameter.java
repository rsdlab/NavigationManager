package RTC;


/**
* RTC/PathPlanPrameter.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/MobileRobot.idl����
* 2014�N9��4�� 22��56��14�b JST
*/

public final class PathPlanPrameter implements org.omg.CORBA.portable.IDLEntity
{

  /// Location of the goal.
  public RTC.Pose2D targetPose = null;

  /// Location of Robot.
  public RTC.Pose2D currentPose = null;

  /// How far away from the waypoint is considered success (radius in metres).
  public double distanceTolerance = (double)0;

  /// How much off the target heading is considered success (in radians).
  public double headingTolerance = (double)0;

  /// Target time to arrive at the waypoint by.
  public RTC.Time timeLimit = null;

  /// Maximum sped to travel at while heading to the waypoint.
  public RTC.Velocity2D maxSpeed = null;

  public PathPlanPrameter ()
  {
  } // ctor

  public PathPlanPrameter (RTC.Pose2D _targetPose, RTC.Pose2D _currentPose, double _distanceTolerance, double _headingTolerance, RTC.Time _timeLimit, RTC.Velocity2D _maxSpeed)
  {
    targetPose = _targetPose;
    currentPose = _currentPose;
    distanceTolerance = _distanceTolerance;
    headingTolerance = _headingTolerance;
    timeLimit = _timeLimit;
    maxSpeed = _maxSpeed;
  } // ctor

} // class PathPlanPrameter
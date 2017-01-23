/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.android.car;

public final class R {
    public static final class array {
        /**  Audio routing policy for all H/W variants. Each item represents policy for one variant.

         Each item is defined in this format:
         physicalStreamNumber:(streamType,)*StreamType#physicalStreamNumber:...

           Stream type is logical stream type to route to the physical stream. Currently defined
           types are: call, media, nav_guidance, voice_command, alarm, notification, system, safety,
             and unknown
               unknown is for stream not tagged with specific contents.
           physicalStreamNumber should be [0, maxNumberOfPhysicalStream - 1].
         There is no "radio" as radio routing is outside android (for external module) or same as
         music (for android internal module)
		 OEM can put multiple policies as item and VEHICLE_PROPERTY_AUDIO_HW_VARIANT in vehicle HAL
		 can decide which policy to use for the given H/W. This allows OEMs to support multuple
		 audio policy from single android S/W by detecting system's audio capability in
		 vehicle HAL.
         */
        public static int audioRoutingPolicy=0x7f040000;
    }
    public static final class attr {
    }
    public static final class drawable {
        public static int car_ic_mode=0x7f020000;
    }
    public static final class id {
        public static int instrument_cluster_layout=0x7f060000;
    }
    public static final class layout {
        public static int instrument_cluster=0x7f030000;
    }
    public static final class string {
        public static int car_permission_car_navigation_manager=0x7f050019;
        /**  Permission text: can access your car's information [CHAR LIMIT=NONE] 
         */
        public static int car_permission_desc=0x7f050004;
        /**  Permission text: apps can control car amera [CHAR LIMIT=NONE] 
         */
        public static int car_permission_desc_camera=0x7f050006;
        /**  Permission text: apps can access navigation manager to report navigation data in instrument
         cluster [CHAR LIMIT=NONE] 
         */
        public static int car_permission_desc_car_navigation_manager=0x7f05001a;
        /**  Permission text: can emulate information from your car [CHAR LIMIT=NONE] 
         */
        public static int car_permission_desc_control_app_blocking=0x7f050018;
        /**  Permission text: can access your car's fuel level [CHAR LIMIT=NONE] 
         */
        public static int car_permission_desc_fuel=0x7f050008;
        /**  Permission text: apps can control car hvac [CHAR LIMIT=NONE] 
         */
        public static int car_permission_desc_hvac=0x7f05000a;
        /**  Permission text: can access your car's mileage information [CHAR LIMIT=NONE] 
         */
        public static int car_permission_desc_mileage=0x7f05000c;
        /**  Permission text: can emulate information from your car [CHAR LIMIT=NONE] 
         */
        public static int car_permission_desc_mock_vehicle_hal=0x7f050016;
        /**  Permission text: apps can control car-projection [CHAR LIMIT=NONE] 
         */
        public static int car_permission_desc_projection=0x7f050014;
        /**  Permission text: apps can control car-radio [CHAR LIMIT=NONE] 
         */
        public static int car_permission_desc_radio=0x7f050012;
        /**  Permission text: can access your car's speed [CHAR LIMIT=NONE] 
         */
        public static int car_permission_desc_speed=0x7f05000e;
        /**  Permission text: apps can access car-manufacturer specific data [CHAR LIMIT=NONE] 
         */
        public static int car_permission_desc_vendor_extension=0x7f050010;
        /**   For permissions 
 Permission text: can access your car's information [CHAR LIMIT=NONE] 
         */
        public static int car_permission_label=0x7f050003;
        /**  Permission text: apps can control car camera [CHAR LIMIT=NONE] 
         */
        public static int car_permission_label_camera=0x7f050005;
        public static int car_permission_label_control_app_blocking=0x7f050017;
        /**  Permission text: can access your car's fuel level [CHAR LIMIT=NONE] 
         */
        public static int car_permission_label_fuel=0x7f050007;
        /**  Permission text: apps can control car hvac [CHAR LIMIT=NONE] 
         */
        public static int car_permission_label_hvac=0x7f050009;
        /**  Permission text: can access your car's mileage information [CHAR LIMIT=NONE] 
         */
        public static int car_permission_label_mileage=0x7f05000b;
        public static int car_permission_label_mock_vehicle_hal=0x7f050015;
        /**  Permission text: apps can control car-projection [CHAR LIMIT=NONE] 
         */
        public static int car_permission_label_projection=0x7f050013;
        /**  Permission text: apps can control car-radio [CHAR LIMIT=NONE] 
         */
        public static int car_permission_label_radio=0x7f050011;
        /**  Permission text: can access your car's speed [CHAR LIMIT=NONE] 
         */
        public static int car_permission_label_speed=0x7f05000d;
        /**  Permission text: apps can access car-manufacturer specific data [CHAR LIMIT=NONE] 
         */
        public static int car_permission_label_vendor_extension=0x7f05000f;
        /**  This is kernel device node to allow input event injection for key inputs coming
         from vehicle hal 
         */
        public static int inputInjectionDeviceNode=0x7f050000;
        public static int instrumentClusterRendererFactoryClass=0x7f050002;
        public static int instrumentClusterRendererPackage=0x7f050001;
    }
}
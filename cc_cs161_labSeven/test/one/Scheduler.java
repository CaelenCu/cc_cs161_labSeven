package test.one;
class Scheduler{

    public MedicalEngagement requestToBeSeen(){
        ClinicService.getAvailServices(); 
        ClinicService.selectService();
        if(true){
            makeAppointment();
            //return
        }

        else{
            //ToDo: make Survey
            Survey su = new Survey();
            Survey.getSurvey();
            Survey.fillSurvey();

            ServiceNeed s = new ServiceNeed();
            ServiceNeed.identifyNeed();
            ClinicService.compareServiceNeed(s);
        }
        if(true){
            makeAppointment();
            //return
        }
        else{
            makeReferral();
            //return
        }
        //Should return a MedicalEngagement type
    }
      //Methods
      //ToDo create appointment parameters
      public void makeAppointment(){
      }
            
      //ToDo create referral parameters
      public void makeReferral(){
      }  
}
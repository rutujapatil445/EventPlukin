package com.example.eventplaneer;

import android.app.DatePickerDialog;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import java.util.Calendar;


public class NotificationFragment extends Fragment {

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_notification, container, false);

        TextView date = view.findViewById(R.id.t4);
        ImageView mapButton = view.findViewById(R.id.ib);
        Button book = view.findViewById(R.id.b);
        EditText day = view.findViewById(R.id.e1);

        day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        // Set click listeners for the buttons
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }

            private void showDatePickerDialog() {
                // Get current date
                final Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

                // Create date picker dialog
                DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(),
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                                // Handle date selection
                                String selectedDate = dayOfMonth + "/" + (month + 1) + "/" + year;
                                date.setText(selectedDate);
                            }
                        }, year, month, dayOfMonth);

                // Set minimum date to current date to restrict past dates
                datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);

                // Show the date picker dialog
                datePickerDialog.show();
            }

          /*  private void showDatePickerDialog() {

                // Get current date
                final Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

                // Create date picker dialog
                DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(),
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                                // Handle date selection
                                String selectedDate = dayOfMonth + "/" + (month + 1) + "/" + year;
                                date.setText(selectedDate);
                            }
                        }, year, month, dayOfMonth);

                // Show the date picker dialog
                datePickerDialog.show();
            }*/
            
        });

        /// Map logic
        
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open Google Maps with the specified location
                openGoogleMaps();
            }
            private void openGoogleMaps() {
                // Create a Uri object with the static location coordinates
               // Uri gmmIntentUri = Uri.parse("geo:0,0?q=latitude,longitude(label)");



                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Taj Palace, New Delhi");

                // Create an Intent object to launch Google Maps
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps"); // Specify the package to ensure it opens in Google Maps

                // Check if there's an app to handle this intent
                if (mapIntent.resolveActivity(getActivity().getPackageManager()) != null) {
                    // Start the activity
                    startActivity(mapIntent);
                }
            }

        });

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               /* if (date == null) {
                    // Username field is empty, show an error message
                    date.setError("Please enter a date");
                }
                else if (day == null) {
                    // Username field is empty, show an error message
                    day.setError("Please enter a days");
                }
                else if (day!=null && date !=null){
                    String s1 = "7507247197";
                    String s2 = "New Booking For Event";

                    requireActivity().startService(new Intent(getContext(), MyService.class));
                    Intent i = new Intent(getContext(), Booking.class);
                    startActivity(i);
                    SmsManager sms = SmsManager.getDefault();
                    sms.sendTextMessage(s1, null, s2, null, null);
                    Toast.makeText(getContext(), "SMS Recieved...", Toast.LENGTH_LONG).show();
                }*/
             //   TextView date = view.findViewById(R.id.t4);
             //   EditText day = view.findViewById(R.id.e1);

                String selectedDate = date.getText().toString().trim();
                String selectedDay = day.getText().toString().trim();

                if (selectedDate.isEmpty()) {
                    // Date field is empty, show an error message
                    date.setError("Please select a date");
                } else if (selectedDay.isEmpty()) {
                    // Day field is empty, show an error message
                    day.setError("Please enter number of days");
                } else {
                    String s1 = "7507247197";
                    String s2 = "New Booking For Event";

                    // Start the service
                    requireActivity().startService(new Intent(getContext(), MyService.class));

                    // Start the Booking activity
                    Intent i = new Intent(getContext(), Booking.class);
                    startActivity(i);

                    // Send SMS
                    SmsManager sms = SmsManager.getDefault();
                    sms.sendTextMessage(s1, null, s2, null, null);
                    Toast.makeText(getContext(), "SMS Received...", Toast.LENGTH_LONG).show();
                }
            }
        });

        return view;
    }


}
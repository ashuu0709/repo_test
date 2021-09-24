txt_wlink_home.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {

SpannableString sc = new SpannableString(String.valueOf("TSDPS Website"));
sc.setSpan(new UnderlineSpan(), 0, sc.length(), 0);
txt_wlink_home.setText(sc);

//Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tsdps.telangana.gov.in/"));

// Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://tsdps.telangana.gov.in/"));
// startActivity(browserIntent);

Intent browserIntent = new Intent(Intent.ACTION_VIEW);
browserIntent.setData(Uri.parse("https://tsdps.telangana.gov.in/"));

Log.i("browserIntent==",""+browserIntent);

PendingIntent pi = PendingIntent.getService(MainActivity.this, 1,
browserIntent, PendingIntent.FLAG_IMMUTABLE);
try {
pi.send(MainActivity.this,1,browserIntent);
Log.i("browserIntent=2=",""+browserIntent);
}catch (PendingIntent.CanceledException e) {
Log.i("browserIntent=3=",""+browserIntent);
e.printStackTrace();
}


// startActivity(new Intent(getApplicationContext(), WebLinks.class)
// .putExtra("link","http://www.tsdps.telangana.gov.in/")
// .putExtra("flag","1"));
// finish();
}
});
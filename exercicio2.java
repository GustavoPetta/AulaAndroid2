public void enviarParaSegunda(View view) {

        Intent intent = new Intent(this,SegundaActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextNome);
        String message = editText.getText().toString();
        if(message.isEmpty()){                                                                                                                                                                                                                                                                                                                                  AlertDialog.Builder ad = new AlertDialog.Builder(this);
    ad.setTitle("Cuidado");
   ad.setMessage("Preencha este campo");
   ad.setNeutralButton("OK",null);
   ad.show( );
            Log.e(TAG,"ERRO-->Usuário tentou clicar no botão sem inserir texto!!");
        }else {

            intent.putExtra("EXTRA_MESSAGE", message);
            Log.d(TAG, "Botão foi acionado!");

            startActivity(intent);
        }
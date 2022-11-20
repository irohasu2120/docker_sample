<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class Ddl extends Migration
{

    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('employee', function (Blueprint $table) {
            $table->bigIncrements('employee_id')->comment("従業員ID");
            $table->string('family_name', 10)->comment("姓");
            $table->string('first_name', 10)->comment("名");
            $table->string('family_name_kana', 10)->comment("姓カナ");
            $table->string('first_name_kana', 10)->comment("名カナ");
            $table->string('gender', 1)->comment("性別");
            $table->timestamps();
        });
        
        DB::statement("ALTER TABLE employee COMMENT '従業員マスター'");
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('employee');
    }
}

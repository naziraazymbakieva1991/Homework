public enum DayOfWeek {
    MONDAY("Дуйшомбу"){
        @Override
        public void dayOfWeek() {
            System.out.println("Дуйшомбу куну Жава окуйм ");

        }
    },

    TUESDAY("Шейшемби"){
        @Override
        public void dayOfWeek() {
            System.out.println("Шейшемби куну англиский сабак окум");
        }
    },
    WEDNESDAY("Шаршемби"){
        @Override
        public void dayOfWeek() {
            System.out.println("Шаршемби куну Техничиский сабак болот");
        }
    },
    THURSDAY("Бейшемби ") {
        @Override
        public void dayOfWeek() {
            System.out.println("Бейшемби куну Практика сабак отобуз");
        }
    },
    FRIDAY("Жума") {
        @Override
        public void dayOfWeek() {
            System.out.println("Жума куну Корейский сабак болот");
        }
    },
    SATURDAY("Ишемби") {
        @Override
        public void dayOfWeek() {
            System.out.println("Ишемби куну Турецкий сабак отобуз");
        }
    },
    SUNDAY("Жекшемби") {
        @Override
        public void dayOfWeek() {
            System.out.println("Жекшемби куну сабак жок");
        }
    };




    DayOfWeek (String kurgyzcha){

    }


    public abstract void dayOfWeek();


}

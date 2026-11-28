# Lab 2 – Variables and Operations

- **Name:** Yanin Insorn
- **Student ID:** 693040430-6
- **Section:** 1

- ## Questions

1. Why must DurationCalculator call Integer.parseInt on each argument before computing with them?

  ค่าที่ส่งมาจาก command line เป็น String ไม่ใช่ตัวเลข ต้องใช้ Integer.parseInt เปลี่ยนให้เป็น int ก่อน จึงจะนำไปคำนวณทางคณิตศาสตร์ได้

2. Why must the duration in minutes be computed with floating-point division rather than integer division?

   การหารแบบจำนวนเต็มจะตัดส่วนทศนิยมทิ้ง ดังนั้น 12615 / 60 จะได้ 210 ไม่ใช่ 210.25 การหารแบบทศนิยมจะเก็บส่วนทศนิยมไว้ คำตอบจึงถูกต้อง

3. Why do new BigDecimal(amount) and BigDecimal.valueOf(amount) round 1071.225 to different values?

   ตัวแปร double เก็บ 1071.225 ได้ไม่ตรงเป๊ะ จึงถูกเก็บเป็นเลขที่น้อยกว่า เช่น 1071.22499999 new BigDecimal(amount) ใช้เลขที่เก็บจริงนี้ จึงปัดได้ 1071.22 ส่วน BigDecimal.valueOf(amount) จะแปลง double เป็นข้อความ "1071.225" ก่อน จึงปัดได้ 1071.23
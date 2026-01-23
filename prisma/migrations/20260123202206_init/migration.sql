-- AlterTable
ALTER TABLE "Receipt" ALTER COLUMN "id" SET DEFAULT concat('REC-', md5(random()::text));

-- AlterTable
ALTER TABLE "User" ALTER COLUMN "id" SET DEFAULT concat('USR-', md5(random()::text));

terraform {
  backend "s3" {
    bucket         = "somya-employee-008  "
    key            = "eks-cluster/terraform.tfstate"
    region         = "us-east-1"
    dynamodb_table = "terraform-lock-table" 
    encrypt        = true
  }
}

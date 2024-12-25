# aerospike-jenkins-shared-library
# Aerospike Jenkins Shared Library

This is a simplified Jenkins shared library to automate the deployment of Aerospike using Ansible.

## Usage

1. Create a new pipeline in Jenkins.
2. Use the shared library in the pipeline:
   ```groovy
   @Library('aerospike-jenkins-shared-library') _
   deploy_aerospike()


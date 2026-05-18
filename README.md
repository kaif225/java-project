# Simple Java Maven Azure DevOps Project

Push this project to GitHub.

Then in Azure DevOps:
1. Create Project
2. Pipelines -> New Pipeline
3. Select GitHub repository
4. Use existing azure-pipelines.yml
5. Run pipeline

Pipeline will:
- Build Maven project
- Create JAR file
- Publish artifact
